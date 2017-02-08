package by.belstu.it.prykhach.basejava;

/**
 * Created by Anna on 08.02.2017.
  * @author Prykhach Anna
 * @version 1.1
 */
public class WrapperString {
    /** @value null
     * @see private
     */
    String tempStr;

    public WrapperString(String tempStr) {
        this.tempStr = tempStr;
    }

    public String getTempStr() {
        return tempStr;
    }

    public void setTempStr(String tempStr) {
        this.tempStr = tempStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrapperString that = (WrapperString) o;

        return tempStr.equals(that.tempStr);
    }

    @Override
    public int hashCode() {
        return tempStr.hashCode();
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "tempStr='" + tempStr + '\'' +
                '}';
    }
    public void replace ( char oldchar, char newchar){
        tempStr = tempStr.replace(oldchar, newchar);
        System.out.println(tempStr.replace(oldchar, newchar));
    }




}
