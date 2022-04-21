package com.matayyy.awsimageupload.datastore;

import com.matayyy.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("df832986-3f64-4993-9c26-a85c046447e2"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("cc28f2d4-47cc-45f1-af0c-c8ff4c4d4a4e"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
