package personLibrary;

import dateLibrary.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class personValidations {
        String curp, fSurname, mSurname, name, phoneNumber, state;
        Date dte;
        char sex ;
        
        
        
        personValidations(){
           curp = "";
           fSurname = "";
           mSurname = "";
           name= "";
           phoneNumber = "";
           state = "";
           sex = '\0';
        }
        
        public personValidations(String curp, String fSurname, String mSurname, String name, String phoneNumber, String state, Date dte, char sex){
            this.curp = curp;
            this.fSurname = fSurname;
            this.mSurname = mSurname;
            this.name= name;
            this.phoneNumber = phoneNumber;
            this.state = state;
            this.dte = dte;
            this.sex = sex;
            
            String realCurp="";
            realCurp+= validateSurname(fSurname, mSurname, name)+dte.getYear().substring(2, 4)+dte.getMonth()+dte.getDay()+sex+stateValidate(state)+
                    lettersValidate(fSurname, mSurname, name)+randomValidate();
            
            if(realCurp.substring(0, 17).equalsIgnoreCase(curp.substring(0,17))){
                JFrame f = new JFrame();   
                JOptionPane.showMessageDialog(f, "La curp no es válida", "Error", JOptionPane.ERROR_MESSAGE);
            }else {
                JFrame f = new JFrame();   
                JOptionPane.showMessageDialog(f, "La curp es válida", "Curp válida", JOptionPane.INFORMATION_MESSAGE);
            }
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

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }
        
        public String validateSurname(String fSurname, String mSurname, String name){
            char[] curpArray = new char[4];
            char[] surname = (fSurname.toLowerCase()).toCharArray();
            
            for (int i = 0; i < surname.length; i++) {
                if(i==0){
                        curpArray[0] = surname[i]; 
                }else if((surname[i] == 'a' || surname[i] == 'e' || surname[i] == 'i' || surname[i] == 'o' || surname[i] == 'u') && curpArray[1] == '\0'){
                        curpArray[1] = surname[i];  
                }
            }
            
            curpArray[2] = mSurname.charAt(0);
            curpArray[3] = name.charAt(0);
            
            fSurname = String.valueOf(curpArray).toUpperCase();
            return fSurname;
        }
        
        public String stateValidate(String state){
            char[] arrayState = (state.toLowerCase()).toCharArray();
            char[] curpArray = new char[2];
            for (int i = 0; i < arrayState.length; i++) {
                if(i==0){
                        curpArray[0] = arrayState[i];  
                }else if((arrayState[i] != 'a' && arrayState[i] != 'e' && arrayState[i] != 'i' && arrayState[i] != 'o' && arrayState[i] != 'u')){
                        curpArray[1] = arrayState[i]; 
                }
            }
            state = String.valueOf(curpArray).toUpperCase();
            return state;
        }
        
        public String lettersValidate(String fSurname, String mSurname, String name){
            char[] arrayLetters = (fSurname.toLowerCase()).toCharArray();
            char[] curpArray = new char[3];
            
            for (int i = 0; i < arrayLetters.length; i++) {
                if((arrayLetters[i] != 'a' && arrayLetters[i] != 'e' && arrayLetters[i] != 'i' && arrayLetters[i] != 'o' && arrayLetters[i] != 'u') && i != 0){
                        curpArray[0] = arrayLetters[i]; 
                        break;
                }
            }
            
            arrayLetters = (mSurname.toLowerCase()).toCharArray();
            for (int i = 0; i < arrayLetters.length; i++) {
                if((arrayLetters[i] != 'a' && arrayLetters[i] != 'e' && arrayLetters[i] != 'i' && arrayLetters[i] != 'o' && arrayLetters[i] != 'u') && i != 0){
                        curpArray[1] = arrayLetters[i]; 
                        break;
                }
            }
            
            arrayLetters = (name.toLowerCase()).toCharArray();
            for (int i = 0; i < arrayLetters.length; i++) {
                if((arrayLetters[i] != 'a' && arrayLetters[i] != 'e' && arrayLetters[i] != 'i' && arrayLetters[i] != 'o' && arrayLetters[i] != 'u') && i != 0){
                        curpArray[2] = arrayLetters[i]; 
                        break;
                }
            }
            
            name = String.valueOf(curpArray).toUpperCase();
            return name;
        }
        
        public String randomValidate(){
           int rand = (int) (Math.random() * 100);
            int j = 65 + (rand % 26);
            char c = (char) j;
            int numRan = (int)(Math.random() * 9) + 1;
         
            String rans = String.valueOf(c).toUpperCase() + Integer.toString(numRan);
            return rans.toUpperCase();
        }
}
