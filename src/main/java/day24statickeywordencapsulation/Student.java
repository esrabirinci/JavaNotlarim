package day24statickeywordencapsulation;
/*
  Encapsulation  :  "Data Hiding"(gizlemek) demektir.
  Datayı niçin gizlersiniz?  --Data'yı dış etkenlerden korumak için.
  Data'yı nasıl gizlersin? --Access modifier ini "private" yaparak gizlerim.
  Data'yı gizledikten sonra, başka classlardan okumak istersen ne yaparsın?
  --"get" methodlar( getter) oluşturarak gizlediğimiz dataları okunur hale getirebiliriz.
    set method lar (setter)  oluşturarak gizlediğimiz dataları değiştirebiliriz.

  Variable nin data type ı ile get methodun return type i aynı olmalıdır.
  get methodları isimlendirirken ===> "get + variable name" ancak variable nin data tipi boolean ise "is + variable name"


 */

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }


    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
