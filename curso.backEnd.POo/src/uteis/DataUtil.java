package uteis;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    public static String converterDataPraDataHora(Date date) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY  HH:mm");
        return formatador.format(date);
    }

    public static String converterParaData(Date date) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
        return formatador.format(date);
    }

    public static String converterParaHora(Date date) {
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
        return formatador.format(date);
    }
}
