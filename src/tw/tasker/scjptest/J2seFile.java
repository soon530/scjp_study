package tw.tasker.scjptest;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class J2seFile {
	private File file = null;
	private File directory = null;

	/**
	 * new一個file object後，還不會建檔案
	 */
	@Before
	public void initFileObject() {
		file = new File("NewFile.txt");
		System.out.println("檔案是否存在？" + file.exists());

		directory = new File("D:\\");
		System.out.println("目錄是否存在？" + file.exists());
	}

	/**
	 * 沒有指定實體路徑的話，這裡沒辦法建檔案@@? 但書上確可以..
	 * 
	 * @throws IOException
	 */
	@Test
	public void createNewFile() throws IOException {
		System.out.println("檔案是否存在？" + file.createNewFile());
	}

	/**
	 * 必需要指定路徑，不然跑不出來，產生的暫存檔，不會重覆
	 * 
	 * @throws IOException
	 */
	@Test
	public void createTempFile() throws IOException {
		File tmpFile = File.createTempFile("vic", ".tmp", directory);
	}

	/**
	 * 判別是檔案 or 目錄？
	 */
	@Test
	public void showFileTypeInfo() {
		System.out.println("檔案？" + file.isFile());
		System.out.println("目錄？" + file.isDirectory());
	}

	/**
	 * 可執行？ 可讀？ 可寫？
	 * 
	 * @throws IOException
	 */
	@Test
	public void showFilePermissionInfo() throws IOException {
		System.out.println("可執行？" + file.canExecute());
		System.out.println("可讀取？" + file.canRead());
		System.out.println("可寫入？" + file.canWrite());

		System.out.println("是否 隱藏檔？" + file.isHidden());
	}

	/**
	 * 抓檔名、路徑，其中:Canonical不知是啥？有空再找吧..
	 * 
	 * @throws IOException
	 */
	@Test
	public void showFilePathInfo() throws IOException {
		System.out.println("上層路徑？" + file.getParent());
		System.out.println("檔名？" + file.getName());

		System.out.println("絕對路徑？" + file.getAbsolutePath());
		System.out.println("是否 絕對路徑？" + file.isAbsolute());

		System.out.println("典範路徑？" + file.getCanonicalPath());
		System.out.println("路徑？" + file.getPath());
	}

	/**
	 * D下的所有檔案、目錄列表
	 */
	@Test
	public void listFiles() {
		String[] files = directory.list(); 
		for(String file : files) {
			System.out.println(file);			
		}
	}
}
