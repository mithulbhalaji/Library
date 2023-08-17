package library;



public abstract class LibraryMember {
        private int memberID;
        private String name;    
        
        public LibraryMember(int memberID, String name) {
			this.setMemberID(memberID);
			this.setName(name);
		}

        
		abstract void borrowItem(LibraryItem item);
		
		abstract void returnItem(LibraryItem item);
		

		public int getMemberID() {
			return memberID;
		}

		public void setMemberID(int memberID) {
			this.memberID = memberID;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

        
}
