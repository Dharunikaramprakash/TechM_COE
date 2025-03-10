import React from "react";

const EventList = ({ events }) => {
  return (
    <div className="event-list">
      {events.length > 0 ? (
        events.map((event) => (
          <div key={event.id} className="event-card">
            <h3>{event.name}</h3>
            <p>{event.date}</p>
            <p>{event.duration}</p>
            <p>{event.venue}</p>
            <p><strong>{event.location}</strong></p>
          </div>
        ))
      ) : (
        <p className="text-center">No events found.</p>
      )}
    </div>
  );
};

export default EventList;
