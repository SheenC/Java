cpublic class Numbers {
    static final Object object = new Object();
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            int a[] = {1,2,3,4,5,6,7,8,9,10};
            @Override
            public void run() {
                for(int i=0;i<10 ;i++){
                    synchronized (object){
                        System.out.println("Thread1 starts");
                        object.notify();
                        try {
                            System.out.println("Thread1 waits");
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Thread1 continues");
                        System.out.println(a[i]);
                        System.out.println("Thread1 ends");
                        object.notify();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            int a[] = {1,2,3,4,5,6,7,8,9,10};
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    synchronized (object){
                        System.out.println("Thread2 starts");
                        object.notify();
                        try {
                            System.out.println("Thread2 waits");
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Thread2 continues");
                        System.out.println(a[i]);
                        System.out.println("Thread2 ends");
                    }
                }

            }
        }).start();
    }
}
