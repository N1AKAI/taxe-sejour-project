package ma.aboulhoda.taxesejourproject.bean.taxesejourtrim;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class TauxTaxeSejourTrim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "tauxTaxeSejourTrim")
    private List<TaxeSejourTrim> taxeSejourTrimList;

    public TauxTaxeSejourTrim() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TaxeSejourTrim> getTaxeSejourTrimList() {
        return taxeSejourTrimList;
    }

    public void setTaxeSejourTrimList(List<TaxeSejourTrim> taxeSejourTrimList) {
        this.taxeSejourTrimList = taxeSejourTrimList;
    }
}