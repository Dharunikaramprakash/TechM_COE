import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import Container from "react-bootstrap/Container";
import SearchBar from "./SearchBar";
import EventList from "./EventList";
import "../App.css"; // Ensure this imports the background image styles

const EventFinder = () => {
  const [search, setSearch] = useState("");
  const [selectedLocation, setSelectedLocation] = useState(""); // Dropdown filter

  // List of events
  const events = [
    { id: 1, name: "Tech Conference 2025", date: "21/03/2025", duration: "3 days", venue: "Panimalar Institute Of Technology", location: "Chennai" },
    { id: 2, name: "Music Fest", date: "15/10/2025", duration: "5-6 hours", venue: "Sri Lakshmi Mahal", location: "Erode" },
    { id: 3, name: "Startup Summit", date: "22/03/2025", duration: "2 days", venue: "Coddisia Trade Fair Complex", location: "Coimbatore" },
    { id: 4, name: "AI & Machine Learning Workshop", date: "25/03/2025", duration: "1 day", venue: "Panimalar Engineering College", location: "Chennai" },
    { id: 5, name: "Blockchain Expo", date: "12/05/2025", duration: "2 days", venue: "Anna University Auditorium", location: "Chennai" },
    { id: 6, name: "Cyber Security Forum", date: "08/06/2025", duration: "1 day", venue: "Karpagam College of Engineering", location: "Coimbatore" },
    { id: 7, name: "Gaming Convention", description: "A gathering for gaming enthusiasts, developers, and streamers.", date: "20/07/2025", duration: "2 days", venue: "Hyderabad International Convention Centre", location: "Hyderabad" },
    { id: 8, name: "Health & Wellness Expo", description: "A showcase of the latest innovations in healthcare and fitness.", date: "30/08/2025", duration: "3 days", venue: "Bangalore Trade Center", location: "Bangalore" },
    { id: 9, name: "Photography Workshop", description: "A masterclass in photography by top industry experts.", date: "05/09/2025", duration: "1 day", venue: "Loyola College", location: "Chennai" },
    { id: 10, name: "Film Festival", description: "An international film festival showcasing indie and blockbuster movies.", date: "20/10/2025", duration: "4 days", venue: "Coddisia Trade Fair Complex", location: "Coimbatore" },
    { id: 11, name: "Space Exploration Summit", description: "Discover the latest in space technology and interstellar travel.", date: "14/11/2025", duration: "1 day", venue: "IIT Madras", location: "Chennai" },
    { id: 12, name: "Fashion Week", description: "A glamorous event featuring the latest fashion trends.", date: "10/12/2025", duration: "3 days", venue: "Krishnammal College", location: "Coimbatore" },
    { id: 13, name: "E-Sports Championship", description: "An exciting tournament featuring top e-sports teams.", date: "25/01/2026", duration: "5 days", venue: "Nehru Indoor Stadium", location: "Chennai" },
    { id: 14, name: "Automobile Expo", description: "A display of cutting-edge automobiles and concept cars.", date: "07/02/2026", duration: "3 days", venue: "Kongu Engineering College", location: "Erode" },
    { id: 15, name: "Artificial Intelligence Summit", description: "A high-profile event discussing AI advancements and research.", date: "15/03/2026", duration: "2 days", venue: "IIT Madras Research Park", location: "Chennai" },
  ];

  // Get unique locations from events
  const uniqueLocations = [...new Set(events.map((event) => event.location))];

  // Handle search bar changes
  const handleSearchChange = (e) => setSearch(e.target.value);

  // Handle dropdown filter change
  const handleLocationChange = (e) => setSelectedLocation(e.target.value);

  // Filter events based on search term AND location
  const filteredEvents = events.filter(
    (event) =>
      (event.name.toLowerCase().includes(search.toLowerCase()) || event.location.toLowerCase().includes(search.toLowerCase())) &&
      (selectedLocation === "" || event.location === selectedLocation)
  );

  return (
    <Container className="mt-4 p-4 rounded">
      <h2 className="text-center text-dark">Event Finder</h2>

      {/* Search Bar */}
      <SearchBar search={search} onSearchChange={handleSearchChange} />

      {/* Dropdown for Location Filter */}
      <div className="mb-3 text-center">
        <select className="form-select w-50 mx-auto" value={selectedLocation} onChange={handleLocationChange}>
          <option value="">All Locations</option>
          {uniqueLocations.map((loc, index) => (
            <option key={index} value={loc}>
              {loc}
            </option>
          ))}
        </select>
      </div>

      {/* Filtered Event List */}
      <EventList events={filteredEvents} />
    </Container>
  );
};

export default EventFinder;
