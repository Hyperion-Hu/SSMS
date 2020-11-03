package project.subs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.subs.bean.GroupMember;
import project.subs.bean.User;
import project.subs.dao.GroupMemberDao;
import project.subs.dao.UserDao;
import project.subs.service.SubsService;

import java.util.List;

@Service
public class SubsServiceImpl implements SubsService {

    @Autowired
    private GroupMemberDao groupMemberDao;

    @Override
    public List<GroupMember> findGroupId(User user) {
        List<GroupMember> groupMembers = groupMemberDao.findByUser_Id(user.getId());
        for (GroupMember groupMember: groupMembers) {
            System.out.println(groupMember);
        }

        return null;
    }
}
