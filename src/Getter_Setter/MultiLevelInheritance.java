package Getter_Setter;

public class MultiLevelInheritance {
	public class level1{
		class A{
			int a=10;
			void display() {
				System.out.println("A");
				}
			class B extends A{
				int b=20;
				void show() {
					System.out.println("B");
				}
			class C extends A{}
			}
			}
		}
	}
