package cursoJavaUdemy.classesMetodos;

public class DataAniversario {

    int dia;
    int mes;
    long ano;

    String dataFormatada (){
        return dia + "/" + mes + "/" + ano;
    }

    DataAniversario (int dia, int mes, long ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    DataAniversario (){
        dia = 01;
        mes = 01;
        ano = 1970;
    }

}
