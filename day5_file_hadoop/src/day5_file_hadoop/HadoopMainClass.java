package day5_file_hadoop;

public class HadoopMainClass {

	public static void main(String[] args) {
		String uri1 = "C:\\filetest\\�˻��ܾ��Ʈ.txt";
		String uri2 = "C:\\filetest\\�ϵ� �л� ó�� ���� �ý���.txt";
		String uri3 = "C:\\filetest\\hadoops.html";
		
		HadoopDataClass hadoopDataClass = new HadoopDataClass();
		hadoopDataClass.readDataName(uri1);
		hadoopDataClass.setData(uri1, uri2);
		HadoopPrintClass.saveHtml(uri3, HadoopMethodClass.createHtml(hadoopDataClass.hadoops));
	}

}
