package personLibrary;

import dateLibrary.*;

public class personValidations {
    String curp, fSurname, mSurname, name, phoneNumber, state;
        Date dte;
        char sexo ;
        
        personValidations(){
           curp = "";
           fSurname = "";
           mSurname = "";
           name= "";
           phoneNumber = "";
           state = "";
           sexo = 'H';
        }
        
        personValidations(String curp, String fSurname, String mSurname, String name, String phoneNumber, String state, Date dte, char sexo){
            this.curp = curp;
            this.fSurname = fSurname;
            this.mSurname = mSurname;
            this.name= name;
            this.phoneNumber = phoneNumber;
            this.state = state;
            this.dte = dte;
            this.sexo = sexo;
        }

        public String getphoneNumber() {
            return phoneNumber;
        }

        public void setphoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getCurp() {
            return curp;
        }

        public void setCurp(String curp) {
            this.curp = curp;
        }

        public String getstate() {
            return state;
        }

        public void setstate(String state) {
            this.state = state;
        }

        public Date getDte() {
            return dte;
        }

        public void setDte(Date dte) {
            this.dte = dte;
        }

        public String getmSurname() {
            return mSurname;
        }

        public void setmSurname(String mSurname) {
            this.mSurname = mSurname;
        }

        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }

        public String getfSurname() {
            return fSurname;
        }

        public void setfSurname(String fSurname) {
            this.fSurname = fSurname;
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }
        
}
