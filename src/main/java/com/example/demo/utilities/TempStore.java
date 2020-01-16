package com.example.demo.utilities;

import com.example.demo.entities.User;
import com.example.demo.entities.UserHistory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TempStore {
    private List<User> userList = new ArrayList<>();
    private List<UserHistory> userHistoryList = new ArrayList<>();
 // For Utility components such as calculations/ tempory storage etc. Must be annotated with @Component
    public void addNewUser(User user){
        userList.add(user);
    }

    public void modifyUser(User user) throws Exception {
        User usr = userList.stream().filter(user1 -> user1.getId()==user.getId()).findAny().orElseThrow(()->new Exception("Not Found"));
        usr.setName(user.getName());
        usr.setAddress(user.getAddress());
    }

    public User getUser(int id) throws Exception {
        return userList.stream().filter(user -> user.getId()==id).findAny().orElseThrow(()->new Exception("Not Found"));
    }

    public List<UserHistory> getUserHistory(int userId){
        return new ArrayList<>(userHistoryList.stream().filter(userHistory -> userHistory.getUser().getId()==userId).collect(Collectors.toList()));
    }

    public void saveHistory(UserHistory userHistory){
        userHistoryList.add(userHistory);
    }

}
