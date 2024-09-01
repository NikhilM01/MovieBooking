package com.example.Book_My_show.Service;

import com.example.Book_My_show.DTO.UserEntryDTO;
import com.example.Book_My_show.Entity.TicketsEntity;
import com.example.Book_My_show.Entity.UserEntity;
import com.example.Book_My_show.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    UserRepository userRepositary;

    //Add user implementation with user DTOs
    public void addUserService(UserEntryDTO userEntryDTO){
        UserEntity user = UserConverter.convertToUserEntity(userEntryDTO);
        userRepositary.save(user);

    }
    public String allTickets(int id){
        UserEntity userEntity= userRepositary.findById(id).get();
        //getting tickets list from userEntity
        List<TicketsEntity> ticketBooked = userEntity.getTicketBooked();
        String ans ="";
        ans+= userEntity.getName()+" Total "+ticketBooked.size()+"Booked Ticket  ";

        // iterating and saving ans
        for (TicketsEntity t:ticketBooked
        ) {
            ans += t.getTicketId();
        }
        return ans;
    }
}
