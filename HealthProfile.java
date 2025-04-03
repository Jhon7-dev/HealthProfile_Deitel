/*Neste exercício, você projetará uma classe HealthProfile “inicial” para uma
pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mês, dia
e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.
Para cada atributo, forneça métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos,
intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja
o Exercício 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e
então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
o gráfico de valores IMC
 */
public class HealthProfile{

     private String nome;
     private String sobrenome;
     private String sexo;
     private double altura;
     private double peso;
     private int dia_nascimento;
     private int mes_nascimento;
     private int ano_nascimento;
     private int idade;


         public void Mostar(){
        System.out.println("=== FICHA ===");
        System.out.println("NOME: " + getNome() + " " + getSobrenome());
        System.out.println("ALTURA: " + getAltura() + " METROS ");
        System.out.println("PESO: " + getPeso() + " KG ");
        System.out.println("NASCIMENTO: " + getDia_nascimento() + "/"+ getMes_nascimento()+ "/"+ getAno_nascimento());
        System.out.println("SEXO: " + getSexo());
      
    }
     public void FrequenciaAlvo(){
        int frequenciaCardicaAlvo =  220 - (2025 - this.ano_nascimento) ;
        System.out.println("A FREQUÊNCIA CARDÍACA ALVO DO PACIENTE " + getNome() + " É " + frequenciaCardicaAlvo + " BPM ");
   }
   public  void  FrequenciaCardiacaMaxima(){
        if(idade >= 20 && idade < 30){
             System.out.println("A SUA FREQUÊNCIA CARDÍACA MÁXIMA É ");
             System.out.println("MODERADA 100 - 140 bpm ");
             System.out.println("OU ALTA 140 - 170 bpm ");
        }else if( idade>30 &&  idade < 40){
             System.out.println("A SUA FREQUÊNCIA CARDÍACA MÁXIMA É ");
             System.out.println("MODERADA 95 - 133 bpm ");
             System.out.println("OU ALTA 133 - 162 bpm ");
        }else if(this.idade>40&&this.idade<50){
             System.out.println("A SUA FREQUÊNCIA CARDÍACA MÁXIMA É ");
             System.out.println("MODERADA 90 - 126 bpm ");
             System.out.println("OU ALTA 126 - 153 bpm ");
        }else if(this.idade>50 && this.idade<60){
             System.out.println("A SUA FREQUÊNCIA CARDÍACA MÁXIMA É ");
             System.out.println("MODERADA 85 - 119 bpm ");
             System.out.println("OU ALTA 119 - 145 bpm ");
        }else if (this.idade>60 &&this.idade<70){
             System.out.println("A SUA FREQUÊNCIA CARDÍACA MÁXIMA É ");
             System.out.println("MODERADA 80 - 112 bpm ");
             System.out.println("OU ALTA 112 - 136 bpm ");
        }else {
             System.out.println("A SUA FREQUÊNCIA CARDÍACA MÁXIMA É ");
             System.out.println("MODERADA 75 - 105 bpm ");
             System.out.println("OU ALTA 105 - 128 bpm ");
        }
     }
     public void  CalcularIdade(){

          int idade = 2025 -  this.ano_nascimento ;
          System.out.println("IDADE: " + idade);
     }
      public  void   Imc(){

            double imc = (this.peso)/(this.altura * this.altura);
            if (imc < 18.5) {
                 System.out.println("Abaixo do peso"); 
            } else if (imc >= 18.5 && imc < 24.9) {
                System.out.println("Peso normal"); 
            } else if (imc >= 25.0 && imc < 29.9) {
                System.out.println("SOBREPESO");;
            } else if (imc >= 30.0 && imc < 34.9) {
                System.out.println("OBRESIDADE GRAU 1 ");
            } else if (imc >= 35.0 && imc < 39.9) {
                System.out.println("OBESIDADE GRAU 2 ");
            } else {
                System.out.println("OBESIDADE GRAU 3, OBESIDADE MÓRBITA ");
            }
             
      }
     public String getNome() {
          return nome;
      }
  
      public void setNome(String nome) {
          this.nome = nome;
      }
  
      public String getSobrenome() {
          return sobrenome;
      }
  
      public void setSobrenome(String sobrenome) {
          this.sobrenome = sobrenome;
      }
  
      public int getDia_nascimento() {
          return dia_nascimento;
      }
  
      public void setDia_nascimento(int dia_nascimento) {
          this.dia_nascimento = dia_nascimento;
      }
  
      public int getMes_nascimento() {
          return mes_nascimento;
      }
  
      public void setMes_nascimento(int mes_nascimento) {
          this.mes_nascimento = mes_nascimento;
      }
  
      public int getAno_nascimento() {
          return ano_nascimento;
      }
  
      public void setAno_nascimento(int ano_nascimento) {
          this.ano_nascimento = ano_nascimento;
      }
     public String getSexo() {
          return sexo;
      }
  
      public void setSexo(String  sexo) {
          this.sexo = sexo;
      }
  
      public double getAltura() {
          return altura;
      }
  
      public void setAltura(double altura) {
          this.altura = altura;
      }
  
      public double getPeso() {
          return peso;
      }
  
      public void setPeso(double peso) {
          this.peso = peso;
      }
      public void setIdade(int idade){
        this.idade = idade;
      }
      public int getIdade(){
        return idade;
      }
     
  }
