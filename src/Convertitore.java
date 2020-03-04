public class Convertitore
{
    private int numeroDaConvertire;
    private String numeroConvertito;

    public Convertitore(int numeroDaConvertire)
    {
        setNumeroDaConvertire(numeroDaConvertire);
    }

    public int getNumeroDaConvertire() {
        return numeroDaConvertire;
    }

    public void setNumeroDaConvertire(int numeroDaConvertire) {
        this.numeroDaConvertire = numeroDaConvertire;
    }

    public String getNumeroConvertito() {
        return numeroConvertito;
    }

    public void setNumeroConvertito(String numeroConvertito) {
        this.numeroConvertito = numeroConvertito;
    }

    public String converti()
    {
        int resto;
        String risultato="";
        while(this.numeroDaConvertire>0)
        {
            resto=this.numeroDaConvertire%2;
            this.numeroDaConvertire/=2;
            risultato=resto+risultato;
        }
        return "La cifra che hai inserito espressa in notazione binaria: "+risultato;
    }
}
