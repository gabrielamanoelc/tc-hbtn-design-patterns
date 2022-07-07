public class Program {
      public static void main(String[] args) {
          Director director = new Director();

          GuerreiroBuilder guerreiroBuilder = new GuerreiroBuilder();
          director.buildGuerreiro(guerreiroBuilder);

          MagoBuilder magoBuilder = new MagoBuilder();
          director.buildMago(magoBuilder);

          LadraoBuilder ladraoBuilder = new LadraoBuilder();
          director.buildLadrao(ladraoBuilder);        

          try {
              Mago mago = magoBuilder.build();
              System.out.println(mago);
          } catch(Exception ex) {
              System.out.println(ex.getMessage());
          }

          try {
              Ladrao ladrao = ladraoBuilder.build();
              System.out.println(ladrao);
          } catch(Exception ex) {
              System.out.println(ex.getMessage());
          }

          try {
              Guerreiro guerreiro = guerreiroBuilder.build();
              System.out.println(guerreiro);
          } catch(Exception ex) {
              System.out.println(ex.getMessage());
          }
      }
  }
Personagem { nome = Mago, tipo = MAGO, inteligencia = 10, forca = 2, vigor = 5, resistencia = 3, destreza = 4, dano ataque = 8,80 }
Personagem { nome = Ladrao, tipo = LADRAO, inteligencia = 2, forca = 6, vigor = 8, resistencia = 5, destreza = 10, dano ataque = 7,40 }
Personagem { nome = Guerreiro, tipo = GUERREIRO, inteligencia = 1, forca = 8, vigor = 5, resistencia = 10, destreza = 6, dano ataque = 7,30 }

(410 chars long)
[stderr]: [Anything]
(0 chars long)
