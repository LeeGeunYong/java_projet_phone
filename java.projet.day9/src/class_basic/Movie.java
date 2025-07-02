package class_basic;

public class Movie {
	// 이걸 private 으로 변경해서 다시 출력 
//	public String movieTitle;
//	public int movieTime;
//	public int viewers;
//	
//	
//	public void movieData(String  title, int time, int vie ) {
//		movieTitle = title;
//		movieTime = time;
//		viewers = vie;
//			
//	}
//	
//	public void printData() {
//		System.out.println("영화제목은 = " + movieTitle + "영화상영시간 = " + movieTime + "관람수 = " + viewers);
//	}
//	public String toString() {
//		return "영화제목은 = " + movieTitle + "\n영화상영시간 = " + movieTime + "\n관람수 = " + viewers+"명";
//		
//		
//	}
//	public String toString1() {
//		return String.format("영화제목은 = " + movieTitle + "\n영화상영시간 = " + movieTime + "\n관람수 = " + viewers+"명" );
	
	
	// 이걸 private 으로 변경해서 다시 출력 
	private String movieTitle;
	private String movieTime;
	private String viewers;
	
	
	public  String getMovieTitle() {
		return  movieTitle;
		
	}
	
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public  String MovieTime() {
		return  movieTime;
		
	}
	
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	public  String getViewers() {
		return  viewers;
		
	}
	
	public void setViewers(String viewers) {
		this.viewers =  viewers;
	}

	
	public void movieData(String  title, String time, String vie ) {
		movieTitle = title;
		movieTime = time;
		viewers = vie;
			
	}
	
	public void printData() {
		System.out.println("영화제목은 = " + movieTitle + "영화상영시간 = " + movieTime + "관람수 = " + viewers);
	}
	public String toString() {
		return "영화제목은 = " + movieTitle + "영화상영시간 = " + movieTime + "관람수 = " + viewers+"";
		
		
	}
	public String toString1() {
		return String.format("영화제목은 = " + movieTitle + "영화상영시간 = " + movieTime + "관람수 = " + viewers+"" );
	}
}
