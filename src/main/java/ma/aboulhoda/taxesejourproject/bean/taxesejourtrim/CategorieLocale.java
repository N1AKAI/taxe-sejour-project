package ma.aboulhoda.taxesejourproject.bean.taxesejourtrim;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class CategorieLocale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "categorieLocale")
    private List<TaxeSejourTrim> taxeSejourTrimList;

    public CategorieLocale() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TaxeSejourTrim> getTaxeSejourTrimList() {
        return taxeSejourTrimList;
    }

    public void setTaxeSejourTrimList(List<TaxeSejourTrim> taxeSejourTrimList) {
        this.taxeSejourTrimList = taxeSejourTrimList;
    }
}