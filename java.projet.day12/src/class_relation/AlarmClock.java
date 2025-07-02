package class_relation;

public class AlarmClock {
	
		private Time currentTime;  //현재시간
		private Time alarmTime;   // 알람시간
		
		public AlarmClock() {  //생성자 선언
			alarmTime = new Time(5,30,0); //아람
			currentTime = new Time(15,0,0);//현재 시간
		}
		
		public AlarmClock(Time a, Time c) {  //여기서 타임은 클래스 이고 클래스 주소값이 a.c이다
			alarmTime = a;
			currentTime = c;
		}
		
		public String toString(){
			return "AlarmClock [ alarm : "+ alarmTime.toString() +", current : " + currentTime.toString() + " ]";
		}
}




//여러개  클래스가 만들어졌을때 
//하나의 클래스 가 다른 클래스를 가져올때 필드로 가진다 