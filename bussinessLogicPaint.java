package model;

/**  
* Casey Kluesner  - cjkluesner1@dmacc.edu  
* CIS171 <20432>
* Apr 16, 2024  
*/
public class bussinessLogicPaint {
	private int trimPaint = 400;
	private int ceilingPaint = 350;
	private int wallPaint = 350;
	private double TAX = 0.06;
	private String ceiling = "ceiling";
	private String trim = "Trim";
	private String wall = "walls";
	private double projectSq;
	private String usserChoice;
	private double trimTotal;
	private double wallTotal;
	private double ceilingTotal;
	public bussinessLogicPaint() {
		
	}
	
	public bussinessLogicPaint(String usserChoice, double projectSq) {
		this.usserChoice = usserChoice;
		this.projectSq = projectSq;
		doMath();
	}
		


	

	/**
	 * @return the trimPaint
	 */
	public int getTrimPaint() {
		return trimPaint;
	}

	/**
	 * @param trimPaint the trimPaint to set
	 */
	public void setTrimPaint(int trimPaint) {
		this.trimPaint = trimPaint;
	}

	/**
	 * @return the ceilingPaint
	 */
	public int getCeilingPaint() {
		return ceilingPaint;
	}

	/**
	 * @param ceilingPaint the ceilingPaint to set
	 */
	public void setCeilingPaint(int ceilingPaint) {
		this.ceilingPaint = ceilingPaint;
	}

	/**
	 * @return the wallPaint
	 */
	public int getWallPaint() {
		return wallPaint;
	}

	/**
	 * @param wallPaint the wallPaint to set
	 */
	public void setWallPaint(int wallPaint) {
		this.wallPaint = wallPaint;
	}

	/**
	 * @return the tAX
	 */
	public double getTAX() {
		return TAX;
	}

	/**
	 * @param tAX the tAX to set
	 */
	public void setTAX(double tAX) {
		TAX = tAX;
	}

	/**
	 * @return the ceiling
	 */
	public String getCeiling() {
		return ceiling;
	}

	/**
	 * @param ceiling the ceiling to set
	 */
	public void setCeiling(String ceiling) {
		this.ceiling = ceiling;
	}

	/**
	 * @return the trim
	 */
	public String getTrim() {
		return trim;
	}

	/**
	 * @param trim the trim to set
	 */
	public void setTrim(String trim) {
		this.trim = trim;
	}

	/**
	 * @return the wall
	 */
	public String getWall() {
		return wall;
	}

	/**
	 * @param wall the wall to set
	 */
	public void setWall(String wall) {
		this.wall = wall;
	}

	/**
	 * @return the projectSq
	 */
	public double getProjectSq() {
		return projectSq;
	}

	/**
	 * @param projectSq the projectSq to set
	 */
	public void setProjectSq(double projectSq) {
		this.projectSq = projectSq;
	}

	/**
	 * @return the usserChoice
	 */
	public String getUsserChoice() {
		return usserChoice;
	}

	/**
	 * @param usserChoice the usserChoice to set
	 */
	public void setUsserChoice(String usserChoice) {
		this.usserChoice = usserChoice;
	}

	/**
	 * @return the trimTotal
	 */
	public double getTrimTotal() {
		return trimTotal;
	}

	/**
	 * @param trimTotal the trimTotal to set
	 */
	public void setTrimTotal(double trimTotal) {
		this.trimTotal = trimTotal;
	}

	/**
	 * @return the wallTotal
	 */
	public double getWallTotal() {
		return wallTotal;
	}

	/**
	 * @param wallTotal the wallTotal to set
	 */
	public void setWallTotal(double wallTotal) {
		this.wallTotal = wallTotal;
	}

	/**
	 * @return the ceilingTotal
	 */
	public double getCeilingTotal() {
		return ceilingTotal;
	}

	/**
	 * @param ceilingTotal the ceilingTotal to set
	 */
	public void setCeilingTotal(double ceilingTotal) {
		this.ceilingTotal = ceilingTotal;
	}
	

		
		public void  doMath() {
			
			double  trimPrice = 40.00;
			double  ceilingPrice = 15.00;
			double  wallPrice = 20.00;
			double trimMath = projectSq/trimPaint * trimPrice;
			double trimTax = trimMath * TAX;
			  this.trimTotal = trimTax + trimMath;
			double wallMath = projectSq/wallPaint * wallPrice;
			double wallTax = wallMath * TAX;
			 this.wallTotal = wallMath+wallTax;
			double ceilingMath = projectSq/ceilingPaint * ceilingPrice;
			double ceilingTax = ceilingMath * TAX;
			  this.ceilingTotal = ceilingMath + ceilingTax;
			 
			
	
	
	}
	}
