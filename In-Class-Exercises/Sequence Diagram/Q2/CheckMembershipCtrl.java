
public class CheckMembershipCtrl {
    private TeamDAO teamDAO;

    public CheckMembershipCtrl() {
        teamDAO = new TeamDAO();
    }

    // complete the checkMembershipDuration method here
    public int checkMembershipDuration(String studentName, String teamName) {
        Team team = teamDAO.retrieve(teamName);
        TMSDate dateFormed = team.getDateFormed();
        Student member = team.retrieve(studentName);
        if (member == null) {
            return -1;
        }
        TMSDate dateJoined = member.getDateJoined();
        int duration = dateJoined.calculateDifference(dateFormed);
        return duration;
        
        }
}
