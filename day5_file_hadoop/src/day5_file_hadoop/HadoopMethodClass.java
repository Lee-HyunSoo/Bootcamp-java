package day5_file_hadoop;

import java.util.Map;

public class HadoopMethodClass {

	public HadoopMethodClass() {
	}
	
	public static String createHtml(Map<String, Integer> hadoops) {
		String tags = "";
		
		tags += "<html>";
		tags += "<head><title>�� �ܾ��� ���� Ȯ��</title></head>";
		tags += "<body>";
		
		for (Map.Entry<String, Integer> entry : hadoops.entrySet())
			tags += "<div>" + entry.getKey() + " : " + entry.getValue() + "ȸ</div>";
		
		tags += "</body>";
		tags += "</html>";
		
		return tags;
	}
}
