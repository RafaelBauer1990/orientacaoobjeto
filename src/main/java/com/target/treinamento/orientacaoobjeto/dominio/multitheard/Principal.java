package com.target.treinamento.orientacaoobjeto.dominio.multitheard;

public class Principal {
	
	class MinhaThread extends Thread{
		@Override
		public void run() {
			System.out.println("r1");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("r2");
		}
	}

	public static void main(String[] args) {
		
		new Principal().inicializa();

		
	}

	public void inicializa(){
		MinhaThread t1 = new MinhaThread();
		MinhaThread t2 = new MinhaThread();
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
	}

}
