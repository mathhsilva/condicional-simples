public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        //IF and ELSE

//        if (plano == "B") {
//            System.out.println("100 Minutos de Ligação");
//        } else if (plano == "M") {
//            System.out.println("100 Minutos de Ligação");
//            System.out.println("WhatsApp e Instagram GRÁTIS");
//        } else if (plano == "T") {
//            System.out.println("100 Minutos de Ligação");
//            System.out.println("WhatsApp e Instagram GRÁTIS");
//            System.out.println("5gb de Youtube");
//        }

        //**SWITCH CASE  -- UTILIZADO PARA NÃO PRECISAR REPETIR COMO É FEITO NO ELSE IF**//
            switch (plano){
                case "T": {
                    System.out.println("5gb de Youtube");
                }
                case "M": {
                    System.out.println("WhatsApp e Instagram GRÁTIS");
                }
                case "B": {
                    System.out.println("100 Minutos de Ligação");
                }
            }

    }
}
