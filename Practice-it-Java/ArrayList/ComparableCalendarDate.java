public class ComparableCalendarDate {
    public int compareTo(CalendarDate c) {
        if (this.getYear() > p.getYear()) {
            return -1;
        } else if(this.getYear() > p.getYear()){
            return 1;
        } else {
            if (this.getMonth() > p.getMonth()) {
                return -1;
            } else if(this.getMonth() > p.getMonth()){
                return 1;
            } else {
                if (this.getDay() > p.getDay()) {
                    return -1;
                } else if(this.getDay() > p.getDay()){
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
