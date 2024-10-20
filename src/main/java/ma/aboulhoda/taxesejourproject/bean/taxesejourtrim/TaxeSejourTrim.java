package ma.aboulhoda.taxesejourproject.bean.taxesejourtrim;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class TaxeSejourTrim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateDeDebut;
    private LocalDate dateDeFin;

    @ManyToOne
    @JoinColumn(name = "categorie_locale_id")
    private CategorieLocale categorieLocale;

    @ManyToOne
    @JoinColumn(name = "taux_taxe_sejour_trim_id")
    private TauxTaxeSejourTrim tauxTaxeSejourTrim;

    public TaxeSejourTrim() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDeDebut() {
        return dateDeDebut;
    }

    public void setDateDeDebut(LocalDate dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }

    public LocalDate getDateDeFin() {
        return dateDeFin;
    }

    public void setDateDeFin(LocalDate dateDeFin) {
        this.dateDeFin = dateDeFin;
    }

    public CategorieLocale getCategorieLocale() {
        return categorieLocale;
    }

    public void setCategorieLocale(CategorieLocale categorieLocale) {
        this.categorieLocale = categorieLocale;
    }

    public TauxTaxeSejourTrim getTauxTaxeSejourTrim() {
        return tauxTaxeSejourTrim;
    }

    public void setTauxTaxeSejourTrim(TauxTaxeSejourTrim tauxTaxeSejourTrim) {
        this.tauxTaxeSejourTrim = tauxTaxeSejourTrim;
    }
}
