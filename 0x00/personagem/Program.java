public class Program {
      public static void main(String[] args) {
          PersonagemFactory terraMediaPersonagemFactory = new WesterosPersonagemFactory();
          PersonagemFactory westerosPersonagemFactory = new TerraMediaPersonagemFactory();

          try {
              Personagem magoGandalf = terraMediaPersonagemFactory.createPersonagem(TipoPersonagem.MAGO, "Gandalf");
              System.out.println(magoGandalf);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }

          try {
              Personagem ladinoFrodo = terraMediaPersonagemFactory.createPersonagem(TipoPersonagem.LADRAO, "Frodo");
              System.out.println(ladinoFrodo);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }

          try {
              Personagem guerreiroAragorn = terraMediaPersonagemFactory.createPersonagem(TipoPersonagem.GUERREIRO, "Aragorn");
              System.out.println(guerreiroAragorn);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }

          try {
              Personagem magaMelisandre = westerosPersonagemFactory.createPersonagem(TipoPersonagem.MAGO, "Melisandre");
              System.out.println(magaMelisandre);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }

          try {
              Personagem ladinoOberynMartell = westerosPersonagemFactory.createPersonagem(TipoPersonagem.LADRAO, "Oberyn Martell");
              System.out.println(ladinoOberynMartell);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }

          try {
              Personagem guerreiroKhalDrogo = westerosPersonagemFactory.createPersonagem(TipoPersonagem.GUERREIRO, "Khal Drogo");
              System.out.println(guerreiroKhalDrogo);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          } 

          try {
              Personagem guerreiroInvalido = new Guerreiro("Guerreiro Invalido", 8, 3, 3, 3, 4);
              System.out.println(guerreiroInvalido);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          } 

          try {
              Personagem ladinoInvalido = new Ladrao("Ladino Invalido", 8, 3, 3, 3, 4);
              System.out.println(ladinoInvalido);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }  

          try {
              Personagem magoInvalido = new Mago("Mago Invalido", 1, 8, 7, 7, 10);
              System.out.println(magoInvalido);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }          
      }
  }

rizzo@ubuntu:0x00/personagem$
  rizzo@ubuntu:0x00/personagem$ ls
  Guerreiro.java  Mago.java        PersonagemFactory.java  TerraMediaPersonagemFactory.java  WesterosPersonagemFactory.java Ladrao.java     Personagem.java  Program.java            TipoPersonagem.java
  rizzo@ubuntu:0x00/personagem$ javac Program.java
  rizzo@ubuntu:0x00/personagem$ java Program
  Personagem { nome = Gandalf, tipo = MAGO, inteligencia = 8, forca = 3, vigor = 3, resistencia = 3, destreza = 4, dano ataque = 7,05 }
  Personagem { nome = Frodo, tipo = LADRAO, inteligencia = 1, forca = 8, vigor = 7, resistencia = 7, destreza = 10, dano ataque = 8,25 }
  Personagem { nome = Aragorn, tipo = GUERREIRO, inteligencia = 0, forca = 9, vigor = 7, resistencia = 10, destreza = 7, dano 
  ataque = 8,25 }
  Personagem { nome = Melisandre, tipo = MAGO, inteligencia = 10, forca = 2, vigor = 5, resistencia = 3, destreza = 4, dano ataque = 8,80 }
  Personagem { nome = Oberyn Martell, tipo = LADRAO, inteligencia = 2, forca = 6, vigor = 8, resistencia = 5, destreza = 10, dano ataque = 7,40 }
  Personagem { nome = Khal Drogo, tipo = GUERREIRO, inteligencia = 1, forca = 8, vigor = 5, resistencia = 10, destreza = 6, dano ataque = 7,30 }
  Atributos invalidos para GUERREIRO
  Atributos invalidos para LADRAO
  Atributos invalidos para MAGO
  rizzo@ubuntu:0x00/personagem$
