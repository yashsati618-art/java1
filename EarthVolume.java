class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double piValue = Math.PI;

        double volumeKm3 = (4.0 / 3.0) * piValue * Math.pow(radiusKm, 3);

        double kmToMilesFactor = 1.6;
        double volumeMiles3 = volumeKm3 / Math.pow(kmToMilesFactor, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}