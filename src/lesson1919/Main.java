package lesson1919;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTaskImpl task1=new CopyFileTaskImpl("F:\\Закачки\\Проги\\Adobe Photoshop CS6 13.0.1.3 Extended RePack by JFK2005 (Upd. 04.06.14).exe", "F:\\Закачки\\Проги\\Adobe Photoshop CS6 13.0.1.3 Extended RePack by JFK2005 (Upd. 04.06.14) new.exe");
        CopyFileTaskImpl task2=new CopyFileTaskImpl("F:\\Закачки\\Проги\\andantino-script_[allfont.ru].ttf", "F:\\Закачки\\Проги\\andantino-script_[allfont.ru] new.ttf");
        CopyFileTaskImpl task3=new CopyFileTaskImpl("F:\\Закачки\\Проги\\dotNetFx45_Full_setup.exe", "F:\\Закачки\\Проги\\dotNetFx45_Full_setup new.exe");
        CopyFileTaskImpl task4=new CopyFileTaskImpl("F:\\Закачки\\Проги\\GeForce_Experience_v2.10.2.40.exe", "F:\\Закачки\\Проги\\GeForce_Experience_v2.10.2.40 new.exe");
        CopyFileTaskImpl task5=new CopyFileTaskImpl("F:\\Закачки\\Проги\\ideaIC-2018.3.2.exe", "F:\\Закачки\\Проги\\ideaIC-2018.3.2 new.exe");
        FindFilesTaskImpl task6=new FindFilesTaskImpl();
        task6.setDirectory("F:\\Закачки\\Проги");
        task6.setFileNameSearchString("install_flashplayer17x32pp_chra_dy_aaa_aih.exe");
        task6.setPrintStream(System.out);
        FindFilesTaskImpl task7=new FindFilesTaskImpl();
        task7.setDirectory("F:\\Закачки\\Проги");
        task7.setFileNameSearchString("jdk-11.0.1_windows-x64_bin.exe");
        task7.setPrintStream(System.out);
        FindFilesTaskImpl task8=new FindFilesTaskImpl();
        task8.setDirectory("F:\\Закачки\\Проги");
        task8.setFileNameSearchString("OperaSetup.exe");
        task8.setPrintStream(System.out);
        FindFilesTaskImpl task9=new FindFilesTaskImpl();
        task9.setDirectory("F:\\Закачки\\Проги");
        task9.setFileNameSearchString("scarlett-mixcontrol-1.8.exe");
        task9.setPrintStream(System.out);
        FindFilesTaskImpl task10=new FindFilesTaskImpl();
        task10.setDirectory("F:\\Закачки\\Проги");
        task10.setFileNameSearchString("uTorrent.exe");
        task10.setPrintStream(System.out);
        task1.setFileCopyUtils(new FileCopyWithChannel());
        task2.setFileCopyUtils(new FileCopyWithChannel());
        task3.setFileCopyUtils(new FileCopyWithChannel());
        task4.setFileCopyUtils(new FileCopyWithChannel());
        task5.setFileCopyUtils(new FileCopyWithChannel());
        TaskStorageImpl storage=new TaskStorageImpl();
        storage.add(task1);
        storage.add(task2);
        storage.add(task3);
        storage.add(task4);
        storage.add(task5);
        storage.add(task6);
        storage.add(task7);
        storage.add(task8);
        storage.add(task9);
        storage.add(task10);
        TaskExecutorImpl executor1=new TaskExecutorImpl();
        executor1.setStorage(storage);
        TaskExecutorImpl executor2=new TaskExecutorImpl();
        executor2.setStorage(storage);
        TaskExecutorImpl executor3=new TaskExecutorImpl();
        executor3.setStorage(storage);
        executor1.start();
        executor2.start();
        executor3.start();
    }
}
