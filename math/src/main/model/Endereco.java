package model.Endereco;

public class endereco {

public String rua;
public String cidade;
public String uf;
public String cep;
public String pais;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "endereco= "
                "rua= " + rua +
                " cidade= " + cidade +
                " uf='" + uf +
                " cep= " + cep +
                " pais= " + pais;
    }
}
