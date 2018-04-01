package example.com.recyclerandcardview;

/**
 * Created by compaq on 4/1/2018.
 */

public class ListModel {
    private String companyName;
    private String companyCEO;
    private int companyLogo;

    public ListModel(String companyName, String companyCEO, int companyLogo) {
        this.companyName = companyName;
        this.companyCEO = companyCEO;
        this.companyLogo = companyLogo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCEO() {
        return companyCEO;
    }

    public void setCompanyCEO(String companyCEO) {
        this.companyCEO = companyCEO;
    }

    public int getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(int companyLogo) {
        this.companyLogo = companyLogo;
    }
}
