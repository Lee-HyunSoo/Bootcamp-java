package com.lhs.db;

/*
 * DB 조회 : 글 목록버튼을 눌렀을 때 
 * select 필요한필드리스트 from table명 limit 시작번호, 개수 order by 번호필드 desc;
 * 
 * DB 삭제 : 글 삭제버튼을 눌렀을 때 
 * delete from 테이블명 where 번호필드 = 삭제할 번호;
 * delete는 한 필드가 삭제되는 것이 아니라, 한 레코드가 지워진다.
 * 
 * DB 수정 : 글 수정 후 등록버튼을 눌렀을 때
 * update 테이블명 set 수정필드 = 수정값, 수정필드 = 수정값 ... where 번호필드 = 기존번호; 
 * 
 * DB 삽입 : 글 작성 후 등록버튼을 눌렀을 때
 * insert into 테이블명 (필드명 리스트) values (각 필드리스트에 해당하는 값들)
 */
public class SQLClass {

}
