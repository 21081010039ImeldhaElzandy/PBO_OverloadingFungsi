package vector3;

public class Vector3 {
    public int[] array;
    
    public Vector3(int x, int y, int z) {
        array = new int[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
    }
    
    public int[] getArray() {
        return array;
    }
    
    public Vector3 multiply(int scalar) {
        Vector3 hasil = new Vector3(array[0] * scalar, 
                array[1] * scalar, 
                array[2] * scalar);
        return hasil;
    }
    
    public int multiply(Vector3 vector) {
        int hasil = array[0] * vector.getArray()[0] + 
                array[1] * vector.getArray()[1] + 
                array[2] * vector.getArray()[2];
        return hasil;
    }
    
    public static void main(String[] args) {
        Vector3 vector1 = new Vector3(1,2,3);
        Vector3 vector2 = new Vector3(4, 5, 6);
        
        // perkalian vector dengan scalar
        Vector3 hasil1 = vector1.multiply(5);
        System.out.println("Hasil perkalian vector 1 dengan scalar 5 = [" 
            + hasil1.getArray()[0] + ", " + hasil1.getArray()[1] + ", " 
            + hasil1.getArray()[2] + "]");
        
        // perkalian vector dengan vector
        int hasil2 = vector1.multiply(vector2);
        System.out.println("Hasil perkalian antara vector 1 dengan vector 2 = " + hasil2);
    }
}
