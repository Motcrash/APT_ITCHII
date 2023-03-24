package dateLibrary;

public class Date {
    private String day, month, year;
    
    public Date(int day, int month, int year) throws Exception{
        if((day>31 || day<1)){
            throw new invalidDay("Día inválido");
        }else if((month>12 || month < 1)){
            throw new invalidMonth("Mes inválido");
        }else if(year<1000 || year>9999){
            throw new invalidMonth("Año inválido");
        }else{
            if(day<10){
                this.day = "0"+day;
            }else this.day = Integer.toString(day);
            
            if(month<10){
                this.month = "0"+month;
            }else this.month = Integer.toString(month);
            
            this.year = Integer.toString(year);
        }
    }

    public String getDay() {
        return day;
    }

    public void setDay(int day) throws invalidDay{
        if(day>31 || day<1){
            throw new invalidDay("Día inválido");
        }else {
            if(day<10){
                this.day = "0"+day;
            }else this.day = Integer.toString(day);
        }
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(int month) throws invalidMonth{
        if(month>12 || month < 1){
            throw new invalidMonth("Mes inválido");
        }else {
            if(month<10){
                this.month = "0"+month;
            }else this.month = Integer.toString(month);
        }
    }

    public String getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = Integer.toString(year);
    }
    
    
}
