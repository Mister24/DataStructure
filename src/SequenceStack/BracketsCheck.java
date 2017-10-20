package SequenceStack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 检查java程序中的花括号、方括号和圆括号是否配对
 * 若能够全部各自配对，则返回true，否则返回false
 * 
 * */
public class BracketsCheck {

	public static boolean bracketsCheck(String filename) {
		
		Stack stack = new SequenceStack();
		
		try {
			
			//带缓存的读入器对象，用于打开文本文件filename
			BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
			
			int ch;
			
			for (ch = bufferedReader.read(); ch != -1; ch = bufferedReader.read()) {
				
				//遇到单引号，内部内容不匹配
				if (ch == 39) {
					
					while (true) {
						
						//文件结束返回假
						if ((ch = bufferedReader.read()) == -1) {
							
							return false;
						}
						
						if (ch == 39) {
							
							//找到对应的单引号，读取下一字符并退出循环
							if ((ch = bufferedReader.read()) == -1) {
								
								return false;
							}
							break;
							
						} else if (ch == 34) {
							
							while (true) {
								
								if ((ch = bufferedReader.read()) == -1) {
									
									return false;
								}
								
								if (ch == 34) {

									if ((ch = bufferedReader.read()) == -1) {
										
										return false;
									}
									break;
								}
							}
						}
					}
				}
				
				switch ((char)ch) {
				case '{':
				case '[':
				case '(':
					stack.push((char)ch);
					break;

				case '}':
					if (stack.peek() == null) {
						
						return false;
					}
					
					//如果栈顶对应的是'{'，则出栈，否则为false
					if ((Character)stack.peek() == '{') {
						
						stack.pop();
					} else {
						
						return false;
					}
					break;
				
				case ']':
					if (stack.peek() == null) {
						
						return false;
					}
					
					if ((Character)stack.peek() == '[') {
						
						stack.pop();
					} else {
						
						return false;
					}
					break;
					
				case ')':
					if (stack.peek() == null) {
						
						return false;
					}
					
					if ((Character)stack.peek() == '(') {
						
						stack.pop();
					} else {
						
						return false;
					}
				}
			}
			
			bufferedReader.close();
			
		}catch (IOException e) {

			System.out.println("文件访问异常" + e);
			e.printStackTrace();
		}
		
		if (stack.isEmpty()) {
			
			return true;
		} else {
			
			return false;
		}
	}
}
