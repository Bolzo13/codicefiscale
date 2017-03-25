package codicefiscaleframe;
/**
 *
 * @author Bolzonella Simone
 */
public class CodiceFiscaleClasse {
    private int i;
    private String cognome=new String();
    private String nome=new String();
    private String data=new String();
    private String comune=new String();
    private String sesso=new String();
    private String vocali=new String();
    private String consonanti=new String();
    private String consonantiCognome=new String();
    private String vocaliCognome=new String();
    private String codice=new String();
    private int checkDigit;
    public void setCognome(String cognomeInput)
    {
        cognome=cognomeInput;
    }
    public void setNome(String nomeInput)
    {
        nome=nomeInput;
    }
    public void setData(String dataInput)
    {
        data=dataInput;
    }
    public void setComune(String comuneInput)
    {
        comune=comuneInput;
    }
    public void setSesso(String sessoInput)
    {
        sesso=sessoInput;
    }
    public void setCodice(String codiceInput)
    {
        codice=codiceInput;
    }
    public String nettaStringa()
    {
        data=data.replace("CEST","");
        data=data.replace("CET","");
        data=data.replace("Mon", "");
        data=data.replace("Tue","");
        data=data.replace("Wed", "");
        data=data.replace("Thu","");
        data=data.replace("Fri", "");
        data=data.replace("Sat","");
        data=data.replace("Sun", "");
        data=data.replace(" ", "");
        String data2 = data.substring(5, 13);
        data=data.replace(data2, "");
        return data;
    }
    public String trovaVocaliNome()
    {
        vocali="";
        for(i=0;i<nome.length();i++)
        {
            if(nome.charAt(i)=='A'||nome.charAt(i)=='E'||nome.charAt(i)=='I'||nome.charAt(i)=='O'||nome.charAt(i)=='U')
            {
                vocali+=nome.charAt(i);
            }
        }
        return vocali;
    }
    public String trovaConsonantiNome()
    {
        consonanti="";
        for(i=0;i<nome.length();i++)
        {
            if(!(nome.charAt(i)=='A'||nome.charAt(i)=='E'||nome.charAt(i)=='I'||nome.charAt(i)=='O'||nome.charAt(i)=='U'))
            {
                consonanti+=nome.charAt(i);
            }
        }
        return consonanti;
    }
    public String trovaVocaliCognome()
    {
        vocaliCognome="";
        for(i=0;i<cognome.length();i++)
        {
            if(cognome.charAt(i)=='A'||cognome.charAt(i)=='E'||cognome.charAt(i)=='I'||cognome.charAt(i)=='O'||cognome.charAt(i)=='U')
            {
                vocaliCognome+=cognome.charAt(i);
            }
        }
        return vocaliCognome;
    }
    public String trovaConsonantiCognome()
    {
        consonantiCognome="";
        for(i=0;i<cognome.length();i++)
        {
            if(!(cognome.charAt(i)=='A'||cognome.charAt(i)=='E'||cognome.charAt(i)=='I'||cognome.charAt(i)=='O'||cognome.charAt(i)=='U'))
            {
                consonantiCognome+=cognome.charAt(i);
            }
        }
        return consonantiCognome;
    }
    public String checkDigit()
    {
        checkDigit=0;
        for(i=0;i<codice.length();i+=2)  //CODICE DI CONTROLLO CARATTERI DISPARI
        {
            switch(codice.charAt(i))
            {
                case '0':checkDigit+=1;
                         break;
                case '1':checkDigit+=0;
                         break;
                case '2':checkDigit+=5;
                         break;
                case '3':checkDigit+=7;
                         break;
                case '4':checkDigit+=9;
                         break;
                case '5':checkDigit+=13;
                         break;
                case '6':checkDigit+=15;
                         break;
                case '7':checkDigit+=17;
                         break;
                case '8':checkDigit+=19;
                         break;
                case '9':checkDigit+=21;
                         break;
                case 'A':checkDigit+=1;
                         break;
                case 'B':checkDigit+=0;
                         break;
                case 'C':checkDigit+=5;
                         break;
                case 'D':checkDigit+=7;
                         break;
                case 'E':checkDigit+=9;
                         break;
                case 'F':checkDigit+=13;
                         break;
                case 'G':checkDigit+=15;
                         break;
                case 'H':checkDigit+=17;
                         break;
                case 'I':checkDigit+=19;
                         break;
                case 'J':checkDigit+=21;
                         break;
                case 'K':checkDigit+=2;
                         break;
                case 'L':checkDigit+=4;
                         break;
                case 'M':checkDigit+=18;
                         break;
                case 'N':checkDigit+=20;
                         break;
                case 'O':checkDigit+=11;
                         break;
                case 'P':checkDigit+=3;
                         break;
                case 'Q':checkDigit+=6;
                         break;
                case 'R':checkDigit+=8;
                         break;
                case 'S':checkDigit+=12;
                         break;
                case 'T':checkDigit+=14;
                         break;
                case 'U':checkDigit+=16;
                         break;
                case 'V':checkDigit+=10;
                         break;
                case 'W':checkDigit+=22;
                         break;
                case 'X':checkDigit+=25;
                         break;
                case 'Y':checkDigit+=24;
                         break;
                case 'Z':checkDigit+=23;
                         break;
            }
        }
        for(i=1;i<codice.length();i+=2)  //CODICE DI CONTROLLO CARATTERI PARI
        {
            switch(codice.charAt(i))
            {
                case '0':checkDigit+=0;
                         break;
                case '1':checkDigit+=1;
                         break;
                case '2':checkDigit+=2;
                         break;
                case '3':checkDigit+=3;
                         break;
                case '4':checkDigit+=4;
                         break;
                case '5':checkDigit+=5;
                         break;
                case '6':checkDigit+=6;
                         break;
                case '7':checkDigit+=7;
                         break;
                case '8':checkDigit+=8;
                         break;
                case '9':checkDigit+=9;
                         break;
                case 'A':checkDigit+=0;
                         break;
                case 'B':checkDigit+=1;
                         break;
                case 'C':checkDigit+=2;
                         break;
                case 'D':checkDigit+=3;
                         break;
                case 'E':checkDigit+=4;
                         break;
                case 'F':checkDigit+=5;
                         break;
                case 'G':checkDigit+=6;
                         break;
                case 'H':checkDigit+=7;
                         break;
                case 'I':checkDigit+=8;
                         break;
                case 'J':checkDigit+=9;
                         break;
                case 'K':checkDigit+=10;
                         break;
                case 'L':checkDigit+=11;
                         break;
                case 'M':checkDigit+=12;
                         break;
                case 'N':checkDigit+=13;
                         break;
                case 'O':checkDigit+=14;
                         break;
                case 'P':checkDigit+=15;
                         break;
                case 'Q':checkDigit+=16;
                         break;
                case 'R':checkDigit+=17;
                         break;
                case 'S':checkDigit+=18;
                         break;
                case 'T':checkDigit+=19;
                         break;
                case 'U':checkDigit+=20;
                         break;
                case 'V':checkDigit+=21;
                         break;
                case 'W':checkDigit+=22;
                         break;
                case 'X':checkDigit+=23;
                         break;
                case 'Y':checkDigit+=24;
                         break;
                case 'Z':checkDigit+=25;
                         break;
            }
        }
        switch(checkDigit%26)
        {
            case  0:return "A";
            case  1:return "B";
            case  2:return "C";
            case  3:return "D";
            case  4:return "E";
            case  5:return "F";
            case  6:return "G";
            case  7:return "H";
            case  8:return "I";
            case  9:return "J";
            case  10:return "K";
            case  11:return "L";
            case  12:return "M";
            case  13:return "N";
            case  14:return "O";
            case  15:return "P";
            case  16:return "Q";
            case  17:return "R";
            case  18:return "S";
            case  19:return "T";
            case  20:return "U";
            case  21:return "V";
            case  22:return "W";
            case  23:return "X";
            case  24:return "Y";
            case  25:return "Z";
            default: return "";
        }
    }
}