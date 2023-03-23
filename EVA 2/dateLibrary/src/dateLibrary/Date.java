package dateLibrary;

public class Date {
    private int day, month, year;
    
    public Date(int day, int month, int year) throws Exception{
        if((day>31 || day<1)){
            throw new invalidDay("Día inválido");
        }else if((month>12 || month < 1)){
            throw new invalidMonth("Mes inválido");
        }else{
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws invalidDay{
        if(day>31 || day<1){
            throw new invalidDay("Día inválido");
        }else this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws invalidMonth{
        if(month>12 || month < 1){
            throw new invalidMonth("Mes inválido");
        }else this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
