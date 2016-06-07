public final class JS2Java {
    public static void main(String[] args) {
        try{
            myroutine();
        }catch(IOException e){
            System.out.println("TypeError");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("RangeError");
        }
        catch(UnsupportedOperationException e){
            System.out.println("EvalError");
        }
        catch(Exception e){
            throw new logMyErrors(e);
        }
    }

    public static void myroutine() {
        System.out.println("myroutine");
        int y = 2
    }

    public static void logMyErrors(Exception e) {
        System.out.println("e");
    }
}
