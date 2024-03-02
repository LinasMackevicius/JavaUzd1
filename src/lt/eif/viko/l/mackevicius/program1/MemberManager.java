package lt.eif.viko.l.mackevicius.program1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MemberManager {
    private List<Member> members;

    public MemberManager() {
        this.members = new ArrayList<>();
    }

    public void addMembers(Member... newMembers) {
        members.addAll(Arrays.asList(newMembers));
    }

    public void printAllMembers() {
        System.out.println("Members:");
        for (Member member : members) {
            System.out.println("ID: " + member.getMemberId() + ", Name: " + member.getMemberName());
        }
    }
}