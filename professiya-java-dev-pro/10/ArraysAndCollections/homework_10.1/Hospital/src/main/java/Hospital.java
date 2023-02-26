public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemperatures = new float[patientsCount];
        for (int i = 0; i < patientsTemperatures.length; i++) {
            patientsTemperatures[i] = (float) Math.round(((Math.random() * 8 + 32) * 100.0) / 100.0);
        }
        return  patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */

        StringBuilder temperaturesOfAllPatients = new StringBuilder();  //TODO Температуры всех пациентов
        float averageTemperature;                                       //TODO Средняя температура
        int healthyPatients = 0;                                        //TODO Количество здоровых
        final float minTemperature = (float) 36.2;
        final float maxTemperature = (float) 36.9;
        float result = 0.0f;
        for (int i = 0; i < temperatureData.length; i++) {
            if (i < temperatureData.length - 1) {
                temperaturesOfAllPatients.append(temperatureData[i]).append(" ");
            } else {
                temperaturesOfAllPatients.append(temperatureData[i]);
            }
            result += temperatureData[i];
            if (temperatureData[i] >= minTemperature && temperatureData[i] <= maxTemperature) {
                healthyPatients++;
            }
        }
        averageTemperature = result / temperatureData.length;

        return "Температуры пациентов: " + temperaturesOfAllPatients +
                "\nСредняя температура: " + Math.round(averageTemperature * 100.0) / 100.0 +
                "\nКоличество здоровых: " + healthyPatients;
    }
}