public class Date {
     int month;
     int day;
     int year;

    //created constructor
    public Date(int myMonth, int myDay, int myYear) {
       setDay(myDay);
       setMonth(myMonth);
       setYear(myYear);
    }

    //create get methods
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    //create set methods
    public void setMonth(int myMonth) {
        if (myMonth > 12 || myMonth <= 0) {
            month = 0;
        } else {
            month = myMonth;
        }
    }

    public void setDay(int myDay) {
        if (myDay > 31 || myDay <= 0) {
            day = 0;
        } else {
            day = myDay;
        }
    }

    public void setYear(int myYear) {
        if (myYear <= 0) {
            year = 0;
        } else {
            year = myYear;
        }

    }

    //create displayDate method
    public void displayDate(){
        System.out.printf("%d/%d/%d", month,day,year);
    }
}
