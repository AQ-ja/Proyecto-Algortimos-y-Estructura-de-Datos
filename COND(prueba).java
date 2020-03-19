public class Condicionales {

    FuncionesLisp Fl = New FuncionesLisp();
    String opera;
    String operador = "";

    public Condicionales(String o){
        evaluarCondicionales(o);
    }
    // asumiendo que entra un string
    public void evaluarCondicionales(String o) {

        for (int i = 0; i <  operandos.length; i++) {
            if(!operandos[i].equals("")){
                if(Character.isDigit(operandos[i].charAt(0))){ //
                    if(a.equals("")){
                        a = Character.toString(operandos[i].charAt(0));
                    }else{
                        b = Character.toString(operandos[i].charAt(0));
                    }
                }
            }

        }
        for (int i = 0; i < opera.length(); i++) {

            //  En estas opciones que usariamos hipotericamente en COND, no meti If porque no eran necesarios segun la guia
            if(opera.contains(">")){
                System.out.println(Fl.mayorMenor((Integer.parseInt(a)),Integer.parseInt(b)));
                break;
            }

            if(opera.contains("<")){
                System.out.println(Fl.menorMayor((Integer.parseInt(a)),Integer.parseInt(b)));
                break;
            }

            if(opera.contains("=")){
                System.out.println(Fl.equals((Integer.parseInt(a)),Integer.parseInt(b)));
                break;
            }

            if(opera.contains("equal")){
                System.out.println(Fl.equals((Integer.parseInt(a)),Integer.parseInt(b)));
                break;
            }

            if(opera.contains("atom")){
                System.out.println(Fl.atom(o));
                break;
            }

            if(opera.contains("list")){
                System.out.println(Fl.lista(o));
                break;
            }

        }
    }
}
