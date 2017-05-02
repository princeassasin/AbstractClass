package com.example.abstractcalculator.java;

abstract class Calculator {

	abstract void calculate();
		}

class add extends Calculator{
	
	@Override
	void calculate() {
		// TODO Auto-generated method stub
		int a =10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
		
	}	
	}

		


