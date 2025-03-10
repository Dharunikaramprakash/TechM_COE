import React from "react";
import { Card } from "react-bootstrap";

const EventCard = ({ event }) => {
  return (
    <Card>
      <Card.Body>
        <Card.Title>{event.name}</Card.Title>
        <Card.Text>{event.date}</Card.Text>
        <Card.Text>{event.duration}</Card.Text>
        <Card.Text>{event.venue}</Card.Text>
        <Card.Text>{event.location}</Card.Text>
        
        <Card.Text>{event.description}</Card.Text>
      </Card.Body>
    </Card>
  );
};

export default EventCard;
