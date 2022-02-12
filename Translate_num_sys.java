static int number10 = 1000; // десячичное число
    static int new_bases = 7; //новое основание
    static int[] base_system;
    static int remainder;

    public static void main(String[] args) {
        base_system = new int[(int)(Math.log10(number10)/Math.log10(new_bases)) + 1];
        System.out.println("New system representation: " + max_powers_quantity(number10));
        System.out.println(Arrays.toString(base_system));
    }

   public static int max_powers_quantity (int remainder) {

       int max_power = max_power(new_bases, remainder);
       if (max_power == 0) {
           base_system[base_system.length - 1] = remainder;
           return remainder;
       }

       int power_coefficient = 0;

       while ((remainder - (int)(Math.pow(new_bases, max_power) * power_coefficient) > 0)) power_coefficient++;
       power_coefficient--;

       base_system[base_system.length - 1 - max_power] = power_coefficient;

       translation_systems.remainder = remainder - (int)(Math.pow(new_bases, max_power) * power_coefficient);

       return max_powers_quantity(translation_systems.remainder);

    }

    public static int power (int base, int power) {
        int result = 1;

        for (int counter = 1; counter <= power; counter++) result *= base;

        return result;

    }

    public static int max_power (int base, int remainder) {
        int counter = 0;
        while ( remainder > power(new_bases, ++counter)) ;
        return --counter;

    }