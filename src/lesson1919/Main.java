package lesson1919;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTaskImpl task1=new CopyFileTaskImpl("F:\\Закачки\\Фильмы\\Arrival.(2016).BDRip.x264.AFM.mkv", "F:\\Закачки\\Фильмы\\Arrival.(2016).BDRip.x264.AFM1.mkv");
        CopyFileTaskImpl task2=new CopyFileTaskImpl("F:\\Закачки\\Фильмы\\Bezumnaya.Svadjba.2014.HDRip.avi", "F:\\Закачки\\Фильмы\\Bezumnaya.Svadjba.2014.HDRip1.avi");
        CopyFileTaskImpl task3=new CopyFileTaskImpl("F:\\Закачки\\Фильмы\\Bullet.to.the.Head.2012.Dub.BDRip.1,46Gb.XviD.AC3.avi", "F:\\Закачки\\Фильмы\\Bullet.to.the.Head.2012.Dub.BDRip.1,46Gb.XviD.AC3111.avi");
        CopyFileTaskImpl task4=new CopyFileTaskImpl("F:\\Закачки\\Фильмы\\Dom.Strannyh.Detey.Miss.Peregrin.2016.RUS.BDRip.x264.-HELLYWOOD.mkv", "F:\\Закачки\\Фильмы\\Dom.Strannyh.Detey.Miss.Peregrin.2016.RUS.BDRip.x264.-HELLYWOOD1.mkv");
        CopyFileTaskImpl task5=new CopyFileTaskImpl("F:\\Закачки\\Фильмы\\Dr.Strange.(2016).WEB-DLRip.x264.AFM.mkv", "F:\\Закачки\\Фильмы\\Dr.Strange.(2016).WEB-DLRip.x264.AFM1.mkv");
        FindFilesTaskImpl task6=new FindFilesTaskImpl();
        task6.setDirectory("F:\\Закачки\\Фильмы");
        task6.setFileNameSearchString("Dr.Strange.(2016).WEB-DLRip.x264.AFM.mkv");
        task6.setPrintStream(System.out);
    }
}
