package lesson1919;

//import nedis.study.interfaces.t6.io.FileCopyUtils;

/**
 * Задача копирования файла в отдельном потоке
 * 
 * @author nedis
 * @version 1.0
 */
public interface CopyFileTask extends Task {
	/**
	 * Устанавливает алгоритм копирования файлов. созданный в предыдущем задании
	 * 
	 * @param copyUtils алгоритм копирования файлов
	 */
	void setFileCopyUtils(FileCopyUtils copyUtils);
}
