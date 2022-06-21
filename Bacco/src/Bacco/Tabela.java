package Bacco;
import java.util.HashMap;

public class Tabela {

      private HashMap<String,Simbolo> tab;

      public Tabela() {

            this.tab = new HashMap<String,Simbolo>();

      }

      public boolean inclui(Simbolo _simb) {

            if(this.tab.containsKey(_simb.getNome()))

                  return false;

            else {

                  this.tab.put(_simb.getNome(),_simb);

                  return true;

            }

      }
      

      public int consultaReferencia(String _chave) {

            return ((Simbolo)this.tab.get(_chave)).getReferencia();

      }

      public boolean isExiste(String _chave) {

            return this.tab.containsKey(_chave);

      }

      public String toString() {

            return this.tab.toString();

      }

	public Simbolo getSimbolo(String valor) {
		return ((Simbolo)this.tab.get(valor));
	}

	public boolean inicializaIdent(String image) {
        if(this.tab.containsKey(image))

            return false;

      else {

    	  Simbolo simbolo = new Simbolo(image,'s');
    	  
            this.tab.put(image,simbolo);

            return true;

      }
		
	}

	public boolean foiInicializado(String image) {
		// TODO Auto-generated method stub
		return this.tab.containsKey(image);
	}

	

}
