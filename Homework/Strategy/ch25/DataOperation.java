package ch25;

public class DataOperation {
	
		private Cipher cipher;
		public DataOperation(Cipher cipher)
		{
			this.cipher = cipher;
		}
		public void setCipher(Cipher cipher)
		{
			this.cipher = cipher;
		}
		public String doEncrypt(int key, String plainText)
		{
			return cipher.doEncrypt(key,plainText);
		}
}