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

	class Dado {
		public synchronized void exibir(String mensagem) {
			System.out.print("["+mensagem);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("]");
		}
	}

	class ThreadExemplo extends Thread{

		Dado dado;
		String str;

		public ThreadExemplo(Dado dado, String str) {
			this.dado = dado;
			this.str = "Thread";
			start(); 
		}

		@Override
		public void run() {

			for (int i = 0; i < 10; i++ ) {
			dado.exibir(str);
				
			//	System.out.println(str);
			}

		}
	}


	public static void main(String[] args) {

		new Principal().inicializa(null);


	}

	public void inicializa(String str){
		Dado dado = new Dado();

		//ThreadExemplo t1 = 
		new ThreadExemplo(dado, str);
		
//		ThreadExemplo t2 = new ThreadExemplo(dado, str);
//		ThreadExemplo t3 = new ThreadExemplo(dado, str);
//		ThreadExemplo t4 = new ThreadExemplo(dado, str);
//		ThreadExemplo t5 = new ThreadExemplo(dado, str);
//		ThreadExemplo t6 = new ThreadExemplo(dado, str);
//		ThreadExemplo t7 = new ThreadExemplo(dado, str);
//		ThreadExemplo t8 = new ThreadExemplo(dado, str);
//		ThreadExemplo t9 = new ThreadExemplo(dado, str);
//		ThreadExemplo t10 = new ThreadExemplo(dado, str);



		//		MinhaThread t1 = new MinhaThread();
		//		MinhaThread t2 = new MinhaThread();
		//		t1.start();
		//		t2.start();
		//		
		//		try {
		//			t1.join();
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		
		//		
		//		System.out.println(t1.isAlive());
		//		System.out.println(t2.isAlive());

	}

}
