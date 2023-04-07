package class07;

/**
 * [미션1] 1. 다음과 같이 member[] 배열에는 콤머로 구분된 한 회원에 대한 정보가 들어있다. 
 * 2. 콤머로 구분된 회원 데이터를
 * split 함수로 분리해서 각각의 회원 객체를 만드세요. 
 * 3. 생성된 회원 객체를 객체 배열에 담아서 출력하세요.
 * 
 * split된 배열에 들어 있는 값들로 회원 객체 생성해서 회원 객체 전용 배열에 저장
 */

public class MemberMain {

	public static void main(String[] args) {
		
		// 기본 데이터를 가공하여 Member 객체로 생성하여 담을 객체 배열 선언
		// Member type 배열 members
		// Member 객체를 생성해서 담을수 있게 됨

		Member[] members = new Member[98]; 

		initData(members);
		// 문자열 배열에 들어있는 값으로 객체 생성해서 members에 
		//	저장해주는 메소드 호출
		
		// 전체 회원 리스트 출력 메소드 만들기
		printMember(members);
		
		// [문제.1] 20대후반 여성의 총 방문횟수 구해서 반한해주는 메소드 만들기
		int count = getVisitCount(members);
		System.out.println("20대 후반 여성의 총 방문 횟수 : " + count);
		System.out.println();
		
		// [문제.2] 40대 이상의 총 인원 수를 구해주는 메소드 만들기
		count = getCount40(members);
		System.out.println("40대 이상의 총 인원 수 출력 : " + count);
	}
	
	private static int getCount40(Member[] members) {
		int count = 0;
		for (Member member : members) {
			String ageTest = member.getAge().substring(0 , 2);
			if (Integer.parseInt(ageTest) >= 40) {
				count += 1;
			}
		}
		return count;
	}

	// 20대 후반 여성의 총 방문횟수 구하는 메소드
	private static int getVisitCount(Member[] members) {
		int count = 0;
		for (Member member : members) {
			if ((member.getAge().equals("20대후반")) && (member.getGender() == '여')) {
				count += member.getNumVisit();
			}
		}
		return count; // 방문횟수 반환
	}
	
	// 전체 회원 리스트 구하는 메소드
	private static void printMember(Member[] members) {
		for (Member member : members) {
			System.out.println(member.getName() + "\t" + member.getJoinDate() + "\t" + member.getLastVisitDate() + "\t" + member.getNumVisit() + "\t" + member.getGender() + "\t" + member.getAge());
		}
	}

	// 기본 데이터를 만들어주는 메소드
	private static void initData(Member[] members) {

		// 회원데이터가 String 타입 배열에 문자열 형태로 저장되어 있다.
		// 이 데이터를 split으로 잘라서 Member 객체를 생성해서
		// Member[] 배열에 저장하세요.
		String[] member = new String[98];
		member[0] = "임재,20190509,20190510,8,남,30대후반";
		member[1] = "성열,20190509,20190510,1,남,30대중반";
		member[2] = "천재,20190509,20190510,3,남,30대초반";
		member[3] = "현수,20190509,20190509,1,남,20대후반";
		member[4] = "진우,20190509,20190510,2,남,30대초반";
		member[5] = "영수,20190509,20190510,2,여,40대후반";
		member[6] = "종화,20190509,20190509,0,남,20대후반";
		member[7] = "윤정,20190509,20190510,3,여,40대후반";
		member[8] = "종호,20190509,20190510,3,남,20대중반";
		member[9] = "동현,20190509,20190510,5,남,20대중반";
		member[10] = "경래,20190509,20190510,1,남,20대후반";
		member[11] = "상일,20190509,20190510,6,남,30대후반";
		member[12] = "재형,20190509,20190510,2,남,30대중반";
		member[13] = "경민,20190509,20190510,4,남,20대중반";
		member[14] = "경애,20190507,20190507,0,여,40대후반";
		member[15] = "동현,20190507,20190507,0,남,40대초반";
		member[16] = "종인,20190507,20190507,0,남,40대중반";
		member[17] = "은혁,20190426,20190504,3,남,30대후반";
		member[18] = "은정,20190426,20190426,1,여,30대중반";
		member[19] = "정은,20190426,20190426,0,여,40대후반";
		member[20] = "진수,20190426,20190426,1,여,60대후반";
		member[21] = "은석,20190426,20190504,2,남,50대초반";
		member[22] = "수진,20190426,20190426,0,여,30대초반";
		member[23] = "유민,20190426,20190426,1,여,40대후반";
		member[24] = "재희,20190426,20190426,2,여,40대후반";
		member[25] = "의환,20190426,20190426,1,남,20대후반";
		member[26] = "관현,20190425,20190425,0,남,40대초반";
		member[27] = "성욱,20190425,20190426,3,남,30대후반";
		member[28] = "의열,20190425,20190426,5,여,30대후반";
		member[29] = "가영,20190425,20190426,1,여,30대중반";
		member[30] = "현수,20190425,20190505,5,남,40대초반";
		member[31] = "기대,20190425,20190426,2,남,40대중반";
		member[32] = "근준,20190425,20190425,0,남,20대후반";
		member[33] = "성준,20190425,20190426,3,남,20대후반";
		member[34] = "종오,20190425,20190426,3,남,50대중반";
		member[35] = "병욱,20190425,20190426,5,남,30대초반";
		member[36] = "서경,20190425,20190426,2,여,30대후반";
		member[37] = "재희,20190425,20190426,1,여,30대초반";
		member[38] = "관순,20190425,20190426,3,여,30대초반";
		member[39] = "충현,20190425,20190426,1,남,30대초반";
		member[40] = "시형,20190425,20190426,1,남,30대후반";
		member[41] = "정윤,20190425,20190426,3,여,30대중반";
		member[42] = "호섭,20190425,20190426,1,남,40대후반";
		member[43] = "상민,20190425,20190426,1,남,30대중반";
		member[44] = "수영,20190425,20190426,1,여,30대중반";
		member[45] = "경훈,20190425,20190426,1,여,30대초반";
		member[46] = "남현,20190218,20190510,10,남,30대후반";
		member[47] = "두근,20190218,20190218,0,남,20대중반";
		member[48] = "윤정,20181022,20190114,18,여,20대후반";
		member[49] = "현민,20181022,20190115,31,남,20대후반";
		member[50] = "철우,20181011,20181024,7,남,30대초반";
		member[51] = "동주,20181011,20190324,75,남,20대후반";
		member[52] = "승민,20181002,20181208,48,남,20대중반";
		member[53] = "근학,20180927,20190129,45,남,20대후반";
		member[54] = "수민,20180927,20190412,50,남,20대후반";
		member[55] = "형석,20180927,20190418,7,남,20대후반";
		member[56] = "명재,20180927,20190118,41,남,30대초반";
		member[57] = "병호,20180927,20181008,3,남,50대초반";
		member[58] = "민태,20180927,20190208,49,남,20대중반";
		member[59] = "신혜,20180927,20190120,49,여,20대후반";
		member[60] = "성권,20180927,20180928,5,남,20대후반";
		member[61] = "영봉,20180927,20181217,45,남,20대후반";
		member[62] = "성구,20180927,20190123,47,남,20대후반";
		member[63] = "부욱,20180927,20181119,24,남,30대초반";
		member[64] = "주현,20180712,20180712,2,여,20대초반";
		member[65] = "다희,20180626,20180626,1,여,20대중반";
		member[66] = "다을,20180625,20180807,40,여,20대중반";
		member[67] = "대희,20180625,20181217,57,남,20대중반";
		member[68] = "자훈,20180625,20190305,47,여,20대중반";
		member[69] = "지원,20180625,20180727,38,여,20대중반";
		member[70] = "재학,20180625,20181101,45,남,20대중반";
		member[71] = "지혜,20180625,20190410,89,여,20대중반";
		member[72] = "중훈,20180625,20180727,31,남,20대중반";
		member[73] = "한솔,20180625,20181205,62,여,20대중반";
		member[74] = "예림,20180625,20181227,28,여,20대중반";
		member[75] = "수현,20180625,20190210,17,여,20대중반";
		member[76] = "소현,20180625,20180727,63,여,20대중반";
		member[77] = "해성,20180625,20180726,38,남,20대후반";
		member[78] = "진안,20180625,20180727,45,남,20대후반";
		member[79] = "지원,20180625,20180726,17,여,20대초반";
		member[80] = "경희,20180625,20190424,27,여,20대중반";
		member[81] = "도형,20180625,20190504,72,남,20대후반";
		member[82] = "태수,20180625,20180808,70,남,20대중반";
		member[83] = "가은,20180625,20180807,42,여,20대중반";
		member[84] = "힘찬,20180625,20180727,33,남,20대중반";
		member[85] = "상협,20180625,20181025,43,남,20대중반";
		member[86] = "용선,20180625,20190102,66,남,20대중반";
		member[87] = "승현,20180625,20181206,50,남,20대중반";
		member[88] = "지원,20180625,20180723,16,여,20대중반";
		member[89] = "한진,20180419,20180719,47,남,20대후반";
		member[90] = "유찬,20180419,20181017,71,남,20대후반";
		member[91] = "기태,20180419,20180813,39,남,20대후반";
		member[92] = "지훈,20180419,20190209,34,남,20대후반";
		member[93] = "봉기,20180419,20181002,71,남,20대후반";
		member[94] = "정규,20180419,20180627,39,남,20대초반";
		member[95] = "상준,20180419,20181228,95,남,20대후반";
		member[96] = "유림,20180419,20180701,53,여,20대후반";
		member[97] = "소영,20180419,20180615,44,여,20대후반";
		
		// "소영,20180419 , 20180615 , 44 , 여 , 20대후반"
		// 콤머를 기준으로 자르면 -> "소영" "20180419" "20180615" "44" "여" "20대후반"
		
		for (int i = 0; i < member.length; i++) {
			String[] arr = member[i].split(","); // 콤머로 구분해서 자르고 배열
			int numVisit = Integer.parseInt(arr[3]);
			char gender = arr[4].charAt(0); // "남" -> '남'
			members[i] = new Member(arr[0] , arr[1] , arr[2] , numVisit , gender , arr[5]);
			
		}

	}

}
